
/*
 *  JScripter Simulation 1.0 - For Java To Script
 *  Copyright (C) 2008-2011  J.J.Liu<jianjunliu@126.com> <http://www.jscripter.org>
 *  
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *  
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jscripter.sim;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import js.Js;
import js.NumberLike;

/**
 * <p>A utility class with its static methods providing JS Simulation.</p>
 * <p>This <b>internal</b> class is only used or extended internally in JS Simulation Library.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must report error on resolving an <tt>internal</tt> class. 
 */
public final class SimUtil
{
	private SimUtil() {}

	private final static long LMAX =  9007199254740992L;
	private final static long LMIN = -9007199254740992L;

	private final static long limit(long v) {
		return v > LMAX ? LMAX : v < LMIN ? LMIN : v;
	}

	private final static Map<Class<?>, Byte> tmap = new HashMap<Class<?>, Byte>();
	private final static byte OTHER        = 0x00;
	private final static byte CHARACTER    = 0x01;
	private final static byte BYTE         = 0x03;
	private final static byte SHORT        = 0x04;
	private final static byte INTEGER      = 0x05;
	private final static byte LONG         = 0x06;
	private final static byte FLOAT        = 0x07;
	private final static byte DOUBLE       = 0x08;

	static {
		tmap.put(Character.class, CHARACTER);
		tmap.put(Byte     .class, BYTE     );
		tmap.put(Short    .class, SHORT    );
		tmap.put(Integer  .class, INTEGER  );
		tmap.put(Long     .class, LONG     );
		tmap.put(Float    .class, FLOAT    );
		tmap.put(Double   .class, DOUBLE   );
	}

	private final static byte tid(Object o) {
		if (o == null) return OTHER;
		Byte tid = tmap.get(o.getClass());
		return tid == null ? OTHER : tid;
	}

	/**
	 * <p>Gets the number representation of the argument if it is numeric.</p>
	 * @param var Any variable
	 * @return the number representation of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	public final static Number getNumber(Object var) {
		switch (tid(var))
		{
			case CHARACTER:
				return (short)((Character)var).charValue();
			case BYTE:
			case SHORT:
			case INTEGER:
			case LONG:
			case FLOAT:
			case DOUBLE:
				return (Number)var;
			default:
				return getNumber(((NumberLike<?>)var).valueOf());
		}
	}

	/**
	 * <p>Performs unary negation, resembling the unary minus operator in JavaScript.</p>
	 * <p>This operation converts a positive value to an equivalently negative value, and 
	 * vice versa. If the operand is not a number, it attempts to convert it to one.</p>
	 * @param var Any numeric value.
	 * @return The negation of the numeric value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	public final static Number neg(Object var) {
		Number n = getNumber(var);
		switch (tid(n))
		{
			case BYTE:
				return (byte )-((Byte   )n).byteValue  ();
			case SHORT:
				return (short)-((Short  )n).shortValue ();
			case INTEGER:
				return (int  )-((Integer)n).intValue   ();
			case LONG:
				return (long )-((Long   )n).longValue  ();
			case FLOAT:
				return (float)-((Float  )n).floatValue ();
			default:
				return -((Double)n).doubleValue();
		}
	}

	/**
	 * <p>Adds numeric operands, resembling the addition operator in JavaScript.</p>
	 * <p>Object operands are converted to numbers. The conversion is performed by the 
	 * {@link Js#valueOf(Object)} operation on the object.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return The sum of the two numeric values.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	public final static Number add(Number var, Number other) {
		switch (tid(var))
		{
			case BYTE:
				return addByte((Byte)var, other);
			case SHORT:
				return addShort((Short)var, other);
			case INTEGER:
				return addInteger((Integer)var, other);
			case LONG:
				return addLong((Long)var, other);
			case FLOAT:
				return addFloat((Float)var, other);
			default:
				return var.doubleValue() + other.doubleValue();
		}
	}

	private final static Number addByte(Byte var, Number other) {
		switch (tid(other))
		{
			case BYTE:
			{
				short v = (short)(var.shortValue() + other.shortValue());
				if ((byte)v != v) {
					return v;
				} else {
					return (byte)v;
				}
			}
			case SHORT:
			{
				int v = var.intValue() + other.intValue();
				if ((short)v != v) {
					return v;
				} else {
					return (short)v;
				}
			}
			case INTEGER:
			{
				long v = var.longValue() + other.longValue();
				if ((int)v != v) {
					return limit(v);
				} else {
					return (int)limit(v);
				}
			}
			case LONG:
			{
				float v = var.floatValue() + other.floatValue();
				if ((long)v != v) {
					return v;
				} else {
					return (long)v;
				}
			}
			case FLOAT:
			{
				double v = var.doubleValue() + other.doubleValue();
				if ((float)v != v) {
					return v;
				} else {
					return (float)v;
				}
			}
			default:
				return var.doubleValue() + other.doubleValue();
		}
	}

	private final static Number addShort(Short var, Number other) {
		switch (tid(other))
		{
			case BYTE:
			case SHORT:
			{
				int v = var.intValue() + other.intValue();
				if ((short)v != v) {
					return v;
				} else {
					return (short)v;
				}
			}
			case INTEGER:
			{
				long v = var.longValue() + other.longValue();
				if ((int)v != v) {
					return limit(v);
				} else {
					return (int)limit(v);
				}
			}
			case LONG:
			{
				float v = var.floatValue() + other.floatValue();
				if ((long)v != v) {
					return v;
				} else {
					return (long)v;
				}
			}
			case FLOAT:
			{
				double v = var.doubleValue() + other.doubleValue();
				if ((float)v != v) {
					return v;
				} else {
					return (float)v;
				}
			}
			default:
				return var.doubleValue() + other.doubleValue();
		}
	}

	private final static Number addInteger(Integer var, Number other) {
		switch (tid(other))
		{
			case BYTE:
			case SHORT:
			case INTEGER:
			{
				long v = var.longValue() + other.longValue();
				if ((int)v != v) {
					return limit(v);
				} else {
					return (int)limit(v);
				}
			}
			case LONG:
			{
				float v = var.floatValue() + other.floatValue();
				if ((long)v != v) {
					return v;
				} else {
					return (long)v;
				}
			}
			case FLOAT:
			{
				double v = var.doubleValue() + other.doubleValue();
				if ((float)v != v) {
					return v;
				} else {
					return (float)v;
				}
			}
			default:
				return var.doubleValue() + other.doubleValue();
		}
	}

	private final static Number addLong(Long var, Number other) {
		switch (tid(other))
		{
			case BYTE:
			case SHORT:
			case INTEGER:
			case LONG:
			{
				float v = var.floatValue() + other.floatValue();
				if ((long)v != v) {
					return v;
				} else {
					return (long)v;
				}
			}
			case FLOAT:
			{
				double v = var.doubleValue() + other.doubleValue();
				if ((float)v != v) {
					return v;
				} else {
					return (float)v;
				}
			}
			default:
				return var.doubleValue() + other.doubleValue();
		}
	}

	private final static Number addFloat(Float var, Number other) {
		switch (tid(other))
		{
			case BYTE:
			case SHORT:
			case INTEGER:
			case LONG:
			case FLOAT:
			{
				double v = var.doubleValue() + other.doubleValue();
				if ((float)v != v) {
					return v;
				} else {
					return (float)v;
				}
			}
			default:
				return var.doubleValue() + other.doubleValue();
		}
	}

	/**
	 * <p>Multiplies the two operands, resembling the multiplication operator in JavaScript.</p>
	 * <p>If used with non-numeric operands, this operation attempts to convert them to 
	 * numbers.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return The product of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	public final static Number mul(Number var, Number other) {
		switch (tid(var))
		{
			case BYTE:
				return mulByte((Byte)var, other);
			case SHORT:
				return mulShort((Short)var, other);
			case INTEGER:
				return mulInteger((Integer)var, other);
			case LONG:
				return mulLong((Long)var, other);
			case FLOAT:
				return mulFloat((Float)var, other);
			default:
				return var.doubleValue() * other.doubleValue();
		}
	}

	private final static Number mulByte(Byte var, Number other) {
		switch (tid(other))
		{
			case BYTE:
			{
				short v = (short)(var.shortValue() * other.shortValue());
				if ((byte)v != v) {
					return v;
				} else {
					return (byte)v;
				}
			}
			case SHORT:
			{
				int v = var.intValue() * other.intValue();
				if ((short)v != v) {
					return v;
				} else {
					return (short)v;
				}
			}
			case INTEGER:
			{
				long v = var.longValue() * other.longValue();
				if ((int)v != v) {
					return limit(v);
				} else {
					return (int)limit(v);
				}
			}
			case LONG:
			{
				float v = var.floatValue() * other.floatValue();
				if ((long)v != v) {
					return v;
				} else {
					return (long)v;
				}
			}
			case FLOAT:
			{
				double v = var.doubleValue() * other.doubleValue();
				if ((float)v != v) {
					return v;
				} else {
					return (float)v;
				}
			}
			default:
				return var.doubleValue() * other.doubleValue();
		}
	}

	private final static Number mulShort(Short var, Number other) {
		switch (tid(other))
		{
			case BYTE:
			case SHORT:
			{
				int v = var.intValue() * other.intValue();
				if ((short)v != v) {
					return v;
				} else {
					return (short)v;
				}
			}
			case INTEGER:
			{
				long v = var.longValue() * other.longValue();
				if ((int)v != v) {
					return limit(v);
				} else {
					return (int)limit(v);
				}
			}
			case LONG:
			{
				float v = var.floatValue() * other.floatValue();
				if ((long)v != v) {
					return v;
				} else {
					return (long)v;
				}
			}
			case FLOAT:
			{
				double v = var.doubleValue() * other.doubleValue();
				if ((float)v != v) {
					return v;
				} else {
					return (float)v;
				}
			}
			default:
				return var.doubleValue() * other.doubleValue();
		}
	}

	private final static Number mulInteger(Integer var, Number other) {
		switch (tid(other))
		{
			case BYTE:
			case SHORT:
			case INTEGER:
			{
				long v = var.longValue() * other.longValue();
				if ((int)v != v) {
					return limit(v);
				} else {
					return (int)limit(v);
				}
			}
			case LONG:
			{
				float v = var.floatValue() * other.floatValue();
				if ((long)v != v) {
					return v;
				} else {
					return (long)v;
				}
			}
			case FLOAT:
			{
				double v = var.doubleValue() * other.doubleValue();
				if ((float)v != v) {
					return v;
				} else {
					return (float)v;
				}
			}
			default:
				return var.doubleValue() * other.doubleValue();
		}
	}

	private final static Number mulLong(Long var, Number other) {
		switch (tid(other))
		{
			case BYTE:
			case SHORT:
			case INTEGER:
			case LONG:
			{
				float v = var.floatValue() * other.floatValue();
				if ((long)v != v) {
					return v;
				} else {
					return (long)v;
				}
			}
			case FLOAT:
			{
				double v = var.doubleValue() * other.doubleValue();
				if ((float)v != v) {
					return v;
				} else {
					return (float)v;
				}
			}
			default:
				return var.doubleValue() * other.doubleValue();
		}
	}

	private final static Number mulFloat(Float var, Number other) {
		switch (tid(other))
		{
			case BYTE:
			case SHORT:
			case INTEGER:
			case LONG:
			case FLOAT:
			{
				double v = var.doubleValue() * other.doubleValue();
				if ((float)v != v) {
					return v;
				} else {
					return (float)v;
				}
			}
			default:
				return var.doubleValue() * other.doubleValue();
		}
	}

	/**
	 * <p>Divides the first operand by the second, resembling the multiplication operator 
	 * in JavaScript.</p>
	 * <p>Used with non-numeric operands, this operation attempts to convert them to 
	 * numbers. If you are used to programming languages that distinguish between integer 
	 * and floating-point numbers, you might expect to get an integer result when you 
	 * divide one integer by another. In JavaScript, however, all numbers are floating-point, 
	 * so all division operations have floating-point results. Division by zero yields positive 
	 * or negative infinity, while <tt>0/0</tt> evaluates to <tt>NaN</tt>.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return The quotient of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	public final static Number div(Number var, Number other) {
		byte tid = tid(other);
		double d = var.doubleValue() / other.doubleValue();
		switch (tid(var))
		{
			case BYTE:
				switch (tid)
				{
					case BYTE:
					case SHORT:
					case INTEGER:
					case LONG:
						byte v = (byte)(((Byte)var).byteValue() / limit(((Number)other).longValue()));
						if (v != d) {
							return d;
						} else {
							return v;
						}
				}
			case SHORT:
				switch (tid)
				{
					case BYTE:
					case SHORT:
					case INTEGER:
					case LONG:
						short v = (short)(((Short)var).shortValue() / limit(((Number)other).longValue()));
						if (v != d) {
							return d;
						} else {
							return v;
						}
				}
			case INTEGER:
				switch (tid)
				{
					case BYTE:
					case SHORT:
					case INTEGER:
						long v = var.longValue() / other.longValue();
						if ((int)v != v) {
							return limit(v);
						} else {
							return (int)limit(v);
						}
				}
			case LONG:
				switch (tid)
				{
					case BYTE:
					case SHORT:
					case INTEGER:
					case LONG:
						float v = var.floatValue() / other.floatValue();
						if ((long)v != v) {
							return v;
						} else {
							return (long)v;
						}
				}
			case FLOAT:
				switch (tid)
				{
					case BYTE:
					case SHORT:
					case INTEGER:
					case LONG:
					case FLOAT:
						double v = var.doubleValue() / other.doubleValue();
						if ((float)v != v) {
							return v;
						} else {
							return (float)v;
						}
				}
			default:
				return d;
		}
	}

	/**
	 * <p>Computes the first operand modulo the second operand, resembling the modulo 
	 * operator in JavaScript.</p>
	 * <p>The operation returns the remainder when the first operand is divided by the 
	 * second operand a certain number of times. If used with non-numeric operands, the 
	 * operation attempts to convert them to numbers. The sign of the result is the same 
	 * as the sign of the first operand.</p>
	 * <p>This operation is typically used with integer operands, it also works for 
	 * floating-point values.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return The remainder.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	public final static Number mod(Number var, Number other) {
		byte tid = tid(other);
		double d = var.doubleValue() % other.doubleValue();
		switch (tid(var))
		{
			case BYTE:
				switch (tid)
				{
					case BYTE:
					case SHORT:
					case INTEGER:
					case LONG:
						byte v = (byte)(((Byte)var).byteValue() % limit(((Number)other).longValue()));
						if (v != d) {
							return d;
						} else {
							return v;
						}
				}
			case SHORT:
				switch (tid)
				{
					case BYTE:
					case SHORT:
					case INTEGER:
					case LONG:
						short v = (short)(((Short)var).shortValue() % limit(((Number)other).longValue()));
						if (v != d) {
							return d;
						} else {
							return v;
						}
				}
			case INTEGER:
				switch (tid)
				{
					case BYTE:
					case SHORT:
					case INTEGER:
						long v = var.longValue() % other.longValue();
						if ((int)v != v) {
							return limit(v);
						} else {
							return (int)limit(v);
						}
				}
			case LONG:
				switch (tid)
				{
					case BYTE:
					case SHORT:
					case INTEGER:
					case LONG:
						float v = var.floatValue() % other.floatValue();
						if ((long)v != v) {
							return v;
						} else {
							return (long)v;
						}
				}
			case FLOAT:
				switch (tid)
				{
					case BYTE:
					case SHORT:
					case INTEGER:
					case LONG:
					case FLOAT:
						double v = var.doubleValue() % other.doubleValue();
						if ((float)v != v) {
							return v;
						} else {
							return (float)v;
						}
				}
			default:
				return d;
		}
	}

	static String getConnectionResponseHeaders(URLConnection c) {
		int i = 0;
		String value;
		StringBuilder sb = new StringBuilder();
		while ((value = c.getHeaderField(i)) != null) {
			String key = c.getHeaderFieldKey(i);
			sb.append(key);
			sb.append(": ");
			sb.append(value);
			i++;
		}
		return sb.toString();
	}

	static String getCharset(URLConnection connection) {
		String contentType = connection == null ? null : connection.getContentType();
		if (contentType != null) {
			StringTokenizer tok = new StringTokenizer(contentType, ";");
			if (tok.hasMoreTokens()) {
				tok.nextToken();
				while (tok.hasMoreTokens()) {
					String assignment = tok.nextToken().trim();
					int eqIdx = assignment.indexOf('=');
					if (eqIdx != -1) {
						String varName = assignment.substring(0, eqIdx).trim();
						if ("charset".equalsIgnoreCase(varName)) {
							String varValue = assignment.substring(eqIdx + 1);
							return unquote(varValue.trim());
						}
					}
				}
			}
		}
		return null;
	}

	static String unquote(String text) {
		if (text.startsWith("\"") && text.endsWith("\"")) {
			return text.substring(1, text.length() - 2);
		}
		return text;
	}

	static byte[] loadStream(InputStream in, int initialBufferSize) throws IOException {
		if (initialBufferSize == 0) {
			initialBufferSize = 1;
		}
		byte[] buffer = new byte[initialBufferSize];
		int offset = 0;
		for (;;) {
			int remain = buffer.length - offset;
			if (remain <= 0) {
				int newSize = buffer.length * 2;
				byte[] newBuffer = new byte[newSize];
				System.arraycopy(buffer, 0, newBuffer, 0, offset);
				buffer = newBuffer;
				remain = buffer.length - offset;
			}
			int numRead = in.read(buffer, offset, remain);
			if (numRead == -1) {
				break;
			}
			offset += numRead;
		}
		if (offset < buffer.length) {
			byte[] newBuffer = new byte[offset];
			System.arraycopy(buffer, 0, newBuffer, 0, offset);
			buffer = newBuffer;
		}
		return buffer;
	}
}

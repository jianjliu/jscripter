
/*
 *  JScripter Emulation 1.0 - To Script Java
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

package org.jscripter.emu.java.lang;

import js.*;

/**
 * <p>The <b>Internal</b> superclass of all errors and exceptions, emulating a
 * standard <tt>java.lang</tt> interface or class with the same simple name as
 * this one.</p>
 * <p>This interface or class is only used internally by JS re-compiler implementations.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the emulated original Java class or interface to this one.
 */
public class Throwable
{
	private Throwable cause;
	private java.lang.String message;
	private ArrayLike<ArrayLike<java.lang.String>> trace;

	/**
	 * <p>Internally constructs a new throwable with <tt>null</tt> as its detail message.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	public Throwable() {}

	/**
	 * <p>Internally constructs a new throwable with detail message.</p>
	 * @param message The detail message.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	public Throwable(java.lang.String message) {
		this.message = message;
	}

	/**
	 * <p>Internally constructs a new throwable with detail message and cause.</p>
	 * @param message The detail message.
	 * @param cause The cause.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	public Throwable(java.lang.String message, Throwable cause) {
		this.cause = cause;
		this.message = message;
	}

	/**
	 * <p>Internally constructs a new throwable with detail cause.</p>
	 * @param cause The cause.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	public Throwable(Throwable cause) {
		this.message = (cause == null) ? null : cause.toString();
		this.cause = cause;
	}

	/**
	 * <p>Returns the cause of this throwable or <tt>null</tt> if the cause is nonexistent or unknown.</p>
	 * <p>The cause is a throwable that caused this throwable to get thrown.</p>
	 * @return The cause of this throwable or <tt>null</tt> if the cause is nonexistent or unknown.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public Throwable getCause() {
		return cause;
	}

	/**
	 * <p>Returns a localized description of this throwable.</p>
	 * @return The localized description of this throwable.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public java.lang.String getLocalizedMessage() {
		return getMessage();
	}

	/**
	 * <p>Returns the detail message string of this throwable.</p>
	 * @return The detail message string of this {@link Throwable} instance (which may be <tt>null</tt>).
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public java.lang.String getMessage() {
		return message;
	}

	/**
	 * <p>Initializes the cause of this throwable to the specified value.</p>
	 * @param cause The cause that caused this throwable to get thrown.
	 * @return A reference to this {@link Throwable} instance.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public Throwable initCause(Throwable cause) {
		if (this.cause != null) {
			throw new java.lang.IllegalStateException(new Value.String("Can't")
					.add(" ").add("overwrite").add(" ").add("cause").var());
		}
		if (cause == this) {
			throw new java.lang.IllegalArgumentException(new Value.String(
					"Self").add("-").add("causation").add(" ").add("not")
					.add(" ").add("permitted").var());
		}
		this.cause = cause;
		return this;
	}

	/**
	 * <p>Returns a short description of this throwable.</p>
	 * @return A string representation of this throwable.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	@Override
	public java.lang.String toString() {
		if (Js.not(this)) {
			return Js.typeof(this);
		} else {
			java.lang.String className = getClass().getName();
			return Js.cond(
					message,
					new Value.String(className).add(" ").add(":").add(" ")
							.add(message).var(), className);
		}
	}

	/**
	 * <p>Fills in the execution stack trace.</p>
	 * <p>This method is only used by re-compilers for a "trace mode" re-compilation.</p>
	 * @param t A {@link Throwable} that stores a stack trace.
	 * @param trace A stack tract of the current execution.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	protected static final void fillInStackTrace(Throwable t,
			ArrayLike<ArrayLike<java.lang.String>> trace) {
		if (Js.not(t.trace)) {
			t.trace = new Vars<ArrayLike<java.lang.String>>().var();
		}
		t.trace.push(trace);
	}

	/**
	 * <p>Prints this throwable and its backtrace to the standard error stream.</p>
	 * <p>In this emulation code, it has to be alerted to a message box.</p>
	 * 
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this method.
	 */
	public void printStackTrace() {
		java.lang.String msg = toString();
		if (Js.be(this) && Js.be(trace)) {
			for (int i = 0; i < trace.length(); ++i) {
				((Value.String) (java.lang.Object) msg)
						.aadd(Js.add("\n", "\t"));
				ArrayLike<java.lang.String> e = trace.get(i);
				if (i < 16) {
					new Value.String(msg).aadd(new Value.String("at").add(" ")
							.add(e.get(0)).add(".").add(e.get(1)).var());
				} else {
					new Value.String(msg).aadd(new Value.String("more")
							.add(".").add(".").add(".").var());
				}
			}
		} else {
			new Value.String(msg).aadd(new Value.String("\n").add("\t")
					.add("(").add("details").add(" ").add("for").add(" ")
					.add("trace").add(" ").add("mode").add(" ").add("only")
					.add(")").var());
		}
		Js.alert(msg);
	}
}

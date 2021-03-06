/*
 * Copyright (C) 2016 Jared Rummler <jared.rummler@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.jaredrummler.fontreader.complexscripts.fonts;

/**
 * <p>Exception thrown when attempting to decode a truetype font file and a format
 * constraint is violated.</p>
 *
 * <p>This work was originally authored by Glenn Adams (gadams@apache.org).</p>
 */
public class AdvancedTypographicTableFormatException extends RuntimeException {

  /**
   * Instantiate ATT format exception.
   */
  public AdvancedTypographicTableFormatException() {
    super();
  }

  /**
   * Instantiate ATT format exception.
   *
   * @param message
   *     a message string
   */
  public AdvancedTypographicTableFormatException(String message) {
    super(message);
  }

  /**
   * Instantiate ATT format exception.
   *
   * @param message
   *     a message string
   * @param cause
   *     a <code>Throwable</code> that caused this exception
   */
  public AdvancedTypographicTableFormatException(String message, Throwable cause) {
    super(message, cause);
  }
}

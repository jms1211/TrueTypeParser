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
 * <p>The <code>GlyphPositioning</code> interface is implemented by a glyph positioning subtable
 * that supports the determination of glyph positioning information based on script and
 * language of the corresponding character content.</p>
 *
 * <p>This work was originally authored by Glenn Adams (gadams@apache.org).</p>
 */
public interface GlyphPositioning {

  /**
   * Perform glyph positioning at the current index, mutating the positioning state object as required.
   * Only the context associated with the current index is processed.
   *
   * @param ps
   *     glyph positioning state object
   * @return true if the glyph subtable applies, meaning that the current context matches the
   * associated input context glyph coverage table; note that returning true does not mean any position
   * adjustment occurred; it only means that no further glyph subtables for the current lookup table
   * should be applied.
   */
  boolean position(GlyphPositioningState ps);

}
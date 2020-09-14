/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2019 Team Abnormals
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package juniebyte.javadungeons.utils;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.poi.PointOfInterestType;

public interface PointOfInterestRegistry {

    static PointOfInterestType register(PointOfInterestTypeCustom pointOfInterestTypeCustom) {
        if (!Registry.POINT_OF_INTEREST_TYPE.containsId(new Identifier(pointOfInterestTypeCustom.id)) &&
                !pointOfInterestTypeCustom.workStationStates.isEmpty())
            return Registry.register(Registry.POINT_OF_INTEREST_TYPE, new Identifier(pointOfInterestTypeCustom.id), pointOfInterestTypeCustom.register());
        else return PointOfInterestType.UNEMPLOYED;
    }

    static PointOfInterestType register(Identifier name, PointOfInterestType pointOfInterestType) {
        if (!Registry.POINT_OF_INTEREST_TYPE.containsId(name))
            return Registry.register(Registry.POINT_OF_INTEREST_TYPE, name, pointOfInterestType);
        else return Registry.POINT_OF_INTEREST_TYPE.get(name);
    }

}
/*
 * WorldEdit, a Minecraft world manipulation toolkit
 * Copyright (C) sk89q <http://www.sk89q.com>
 * Copyright (C) WorldEdit team and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.sk89q.worldedit.world.registry;

import com.sk89q.worldedit.internal.util.DeprecationUtil;
import com.sk89q.worldedit.internal.util.NonAbstractForCompatibility;

@Deprecated(forRemoval = true)
public interface ItemMaterial {
    /**
     * Gets the the maximum quantity of this item that can be in a single stack.
     *
     * @return the maximum quantity
     * @deprecated Use {@link #maxStackSize()} instead.
     */
    @Deprecated(forRemoval = true)
    default int getMaxStackSize() {
        return maxStackSize();
    }

    /**
     * Gets the the maximum quantity of this item that can be in a single stack.
     *
     * @return the maximum quantity
     * @deprecated Deprecated with no alternative
     */
    @Deprecated(forRemoval = true)
    @NonAbstractForCompatibility(delegateName = "getMaxStackSize", delegateParams = {})
    default int maxStackSize() {
        DeprecationUtil.checkDelegatingOverride(getClass());
        return getMaxStackSize();
    }

    /**
     * Gets the the maximum damage this item can take before being broken.
     *
     * @return the maximum damage, or 0 if not applicable
     * @deprecated Use {@link #maxDamage()} instead.
     */
    @Deprecated(forRemoval = true)
    default int getMaxDamage() {
        return maxDamage();
    }

    /**
     * Gets the the maximum damage this item can take before being broken.
     *
     * @return the maximum damage, or 0 if not applicable
     * @deprecated Deprecated with no alternative
     */
    @Deprecated(forRemoval = true)
    @NonAbstractForCompatibility(delegateName = "getMaxDamage", delegateParams = {})
    default int maxDamage() {
        DeprecationUtil.checkDelegatingOverride(getClass());
        return getMaxDamage();
    }
}

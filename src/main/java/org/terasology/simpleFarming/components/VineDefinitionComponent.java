/*
 * Copyright 2016 MovingBlocks
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
 */
package org.terasology.simpleFarming.components;

import org.terasology.entitySystem.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is a component that contains properties about a vine (a multi-block horizontally growing plant).
 */
public class VineDefinitionComponent implements Component {
    /** The category of soil that it can be planted on. */
    public String soilCategory = "Soil";

    /** The maximum number of blocks that can be part of the vine's trunk. */
    public int maxParts = 20;

    /** The prefab name of the seed. */
    public String seedPrefab;

    /** The URI of the block to be used as the sapling (the primitive stage that grows into a trunk block in 1 growth cycle. */
    public String sapling;

    /** The URI of the block to be used to make the trunk. */
    public String trunk;

    /** The URI of the block of the fruit it produces. */
    public String produce;

    /** The name of the plant. */
    public String plantName;

    /** A list of all the parts of the trunk. */
    public List<VinePartComponent> parts = new ArrayList<>();

    /** Whether the vine is currently in the sapling stage. */
    public boolean isSapling = true;

    /** A TimeRange used to calculate the time till the next growth cycle. */
    public TimeRange nextGrowth;

    /** The number of growth cycles left for the vine to become ripe. */
    public int growthsTillRipe;

    /** Decides what direction the vine is slightly elongated in. True = X Direction, False = Z direction. */
    public boolean orientation = Math.random() > 0.5;
}

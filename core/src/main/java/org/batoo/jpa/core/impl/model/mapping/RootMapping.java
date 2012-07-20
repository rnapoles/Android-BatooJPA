/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.batoo.jpa.core.impl.model.mapping;

import org.batoo.jpa.core.impl.model.type.ManagedTypeImpl;

/**
 * The interface for root mappings.
 * 
 * @param <X>
 *            the type of the mapping
 * 
 * 
 * @author hceylan
 * @since $version
 */
public interface RootMapping<X> {

	/**
	 * Returns the mapping corresponding to the name.
	 * 
	 * @param name
	 *            the name of the child mapping
	 * @return the mapping or null
	 * 
	 * @since $version
	 * @author hceylan
	 */
	Mapping<? super X, ?, ?> getChild(String name);

	/**
	 * Returns the mapping corresponding to the path.
	 * 
	 * @param path
	 *            the path of the mapping
	 * @return the mapping
	 * 
	 * @since $version
	 * @author hceylan
	 */
	Mapping<?, ?, ?> getMapping(String path);

	/**
	 * Returns the type of the root mapping.
	 * 
	 * @return the type of the root mapping
	 * 
	 * @since $version
	 * @author hceylan
	 */
	ManagedTypeImpl<?> getType();

	/**
	 * Returns if the root is an entity.
	 * 
	 * @return true if the root is an entity, false otherwise
	 * 
	 * @since $version
	 * @author hceylan
	 */
	boolean isEntity();
}

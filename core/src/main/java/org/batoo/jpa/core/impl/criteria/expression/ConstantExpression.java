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
package org.batoo.jpa.core.impl.criteria.expression;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.batoo.jpa.core.impl.criteria.CriteriaQueryImpl;
import org.batoo.jpa.core.impl.criteria.TypedQueryImpl;
import org.batoo.jpa.core.impl.manager.SessionImpl;
import org.batoo.jpa.core.impl.model.type.TypeImpl;

/**
 * Expressipons for constants.
 * 
 * @author hceylan
 * @since $version
 */
public class ConstantExpression extends ParameterExpressionImpl<Object> {

	private final Object value;

	/**
	 * @param type
	 *            the type of the constant.
	 * @param value
	 *            the value
	 * 
	 * @since $version
	 * @author hceylan
	 */
	public ConstantExpression(TypeImpl<?> type, Object value) {
		super(type, Object.class, null);

		this.value = value;
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	@Override
	public String generateJpqlRestriction(CriteriaQueryImpl<?> query) {
		return this.value.toString();
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	@Override
	public String generateJpqlSelect(CriteriaQueryImpl<?> query) {
		return this.value.toString();
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	@Override
	public String generateSqlSelect(CriteriaQueryImpl<?> query) {
		return this.value instanceof CharSequence ? "'" + this.value.toString() + "'" : this.value.toString();
	}

	/**
	 * {@inheritDoc}
	 * 
	 */
	@Override
	public Object handle(TypedQueryImpl<?> query, SessionImpl session, ResultSet row) throws SQLException {
		return this.value;
	}
}
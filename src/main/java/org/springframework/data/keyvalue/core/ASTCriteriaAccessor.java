/*
 * Copyright 2014 the original author or authors.
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
package org.springframework.data.keyvalue.core;

import org.springframework.data.keyvalue.core.query.KeyValueQuery;
import org.springframework.expression.spel.ExpressionState;
import org.springframework.expression.spel.standard.SpelExpression;

/**
 * @author Christoph Strobl
 * @since 1.10
 * @param <T>
 */
public class ASTCriteriaAccessor<T> implements CriteriaAccessor<T> {

	@Override
	public T resolve(KeyValueQuery<?> query) {

		if (query == null || query.getCritieria() == null) {
			return null;
		}

		if (query.getCritieria() instanceof SpelExpression) {

			SpelExpression spelExpression = (SpelExpression) query.getCritieria();
			ExpressionState state = new ExpressionState(spelExpression.getEvaluationContext());

			// /ExpressionNode node = ExpressionNode.from(spelExpression.getAST(), state);
			// TODO: convert node to some other stuff...
		}
		return null;
	}

}
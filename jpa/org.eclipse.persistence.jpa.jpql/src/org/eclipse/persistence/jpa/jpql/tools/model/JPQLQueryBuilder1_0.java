/*******************************************************************************
 * Copyright (c) 2011, 2018 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Oracle - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.persistence.jpa.jpql.tools.model;

import org.eclipse.persistence.jpa.jpql.parser.JPQLGrammar;
import org.eclipse.persistence.jpa.jpql.parser.JPQLGrammar1_0;
import org.eclipse.persistence.jpa.jpql.tools.model.query.AbstractConditionalClauseStateObject;
import org.eclipse.persistence.jpa.jpql.tools.model.query.SelectClauseStateObject;
import org.eclipse.persistence.jpa.jpql.tools.model.query.SimpleSelectClauseStateObject;
import org.eclipse.persistence.jpa.jpql.tools.model.query.UpdateItemStateObject;

/**
 * An implementation of {@link IJPQLQueryBuilder} that provides support based on the Java Persistence
 * functional specification defined in <a href="http://jcp.org/en/jsr/detail?id=220">JSR-220 -
 * Enterprise JavaBeans 3.0</a>.
 *
 * @version 2.4
 * @since 2.4
 * @author Pascal Filion
 */
@SuppressWarnings("nls")
public final class JPQLQueryBuilder1_0 extends AbstractJPQLQueryBuilder {

    /**
     * Creates a new <code>JPQLQueryBuilder1_0</code>.
     */
    public JPQLQueryBuilder1_0() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected DefaultStateObjectBuilder buildStateObjectBuilder() {
        return new DefaultStateObjectBuilder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefaultConditionalExpressionStateObjectBuilder buildStateObjectBuilder(AbstractConditionalClauseStateObject stateObject) {
        return new DefaultConditionalExpressionStateObjectBuilder(stateObject);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefaultSelectExpressionStateObjectBuilder buildStateObjectBuilder(SelectClauseStateObject stateObject) {
        return new DefaultSelectExpressionStateObjectBuilder(stateObject);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefaultSimpleSelectExpressionStateObjectBuilder buildStateObjectBuilder(SimpleSelectClauseStateObject stateObject) {
        return new DefaultSimpleSelectExpressionStateObjectBuilder(stateObject);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public INewValueStateObjectBuilder buildStateObjectBuilder(UpdateItemStateObject stateObject) {
        return new DefaultNewValueStateObjectBuilder(stateObject);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JPQLGrammar getGrammar() {
        return JPQLGrammar1_0.instance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "JPQLQueryBuilder1_0 using " + getGrammar().toString();
    }
}

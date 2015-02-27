package org.xacml4j.v30.spi.pip;

/*
 * #%L
 * Xacml4J Core Engine Implementation
 * %%
 * Copyright (C) 2009 - 2014 Xacml4J.org
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

import com.google.common.base.Preconditions;
import org.xacml4j.v30.AttributeExpType;
import org.xacml4j.v30.BagOfAttributeExp;

public final class AttributeDescriptor
{
	private String attributeId;
	private AttributeExpType dataType;
	private BagOfAttributeExp defaultValue;

	/**
	 * Constructs category descriptor
	 *
	 * @param attributeId an category identifier
	 * @param dataType an category data type
	 */
	public AttributeDescriptor(String attributeId,
			AttributeExpType dataType)
	{
		Preconditions.checkArgument(attributeId != null);
		Preconditions.checkArgument(dataType != null);
		this.attributeId = attributeId;
		this.dataType = dataType;
	}

	/**
	 * Gets an category identifier
	 *
	 * @return category identifier
	 */
	public String getAttributeId(){
		return attributeId;
	}

	/**
	 * Gets category default value
	 * @return category default value
	 */
	public BagOfAttributeExp getDefaultValue(){
		return defaultValue;
	}

	/**
	 * Gets expected category data type
	 *
	 * @return {@link AttributeExpType} an
	 * category data type
	 */
	public AttributeExpType getDataType(){
		return dataType;
	}
}


package com.michaelpellegrini.brms.healthcare.fact.type;

import javax.measure.Measurable;
import javax.measure.quantity.Length;
import javax.measure.unit.SI;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Height {

	private final Measurable<Length> value;
	
	public Height(Measurable<Length> value) {
		if (value.doubleValue(SI.METRE) <= 0) {
			throw new IllegalArgumentException("Height must be greater than zero");
		}
		
		this.value = value;
	}

	public Measurable<Length> getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this).append("value", value).toString();
	}
	
	
}

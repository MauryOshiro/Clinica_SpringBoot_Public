package br.com.mauryoshiro.clinicaCSC.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import br.com.mauryoshiro.clinicaCSC.interfaces.constraint.StringComEspacos;

public class ValidarStringComEspacos implements ConstraintValidator<StringComEspacos, String> {

	private StringComEspacos stringComEspacos;

	public void initialize(StringComEspacos constraintAnnotation) {
		this.stringComEspacos = constraintAnnotation;
	}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value.replace(" ", "").equals(""))
			return false;
		else
			return true;
	}
}

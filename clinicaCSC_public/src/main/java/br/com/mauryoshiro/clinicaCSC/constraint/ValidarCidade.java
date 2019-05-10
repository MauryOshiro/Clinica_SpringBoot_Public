package br.com.mauryoshiro.clinicaCSC.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import br.com.mauryoshiro.clinicaCSC.interfaces.constraint.CidadeSelecionada;
import br.com.mauryoshiro.clinicaCSC.models.Cidade;

public class ValidarCidade implements ConstraintValidator<CidadeSelecionada, Cidade> {

	private CidadeSelecionada value;

	public void initialize(CidadeSelecionada constraintAnnotation) {
		this.value = constraintAnnotation;
	}

	public boolean isValid(Cidade value, ConstraintValidatorContext context) {
		try {
			if (value.getIdCidade() == 0) {
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			return false;
		}
	}

}

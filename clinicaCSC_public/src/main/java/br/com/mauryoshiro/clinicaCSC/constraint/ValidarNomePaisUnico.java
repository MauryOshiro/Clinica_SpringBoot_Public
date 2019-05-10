package br.com.mauryoshiro.clinicaCSC.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.mauryoshiro.clinicaCSC.interfaces.constraint.NomePaisUnico;
import br.com.mauryoshiro.clinicaCSC.service.PaisService;

public class ValidarNomePaisUnico implements ConstraintValidator<NomePaisUnico, String> {
	
	private NomePaisUnico value;
	
	@Autowired
	private PaisService paisService;

	public void initialize(NomePaisUnico constraintAnnotation) {
		this.value = constraintAnnotation;
	}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		try {
			if (!paisService.verificaSeExistePeloNome(value)) {
				// País válido
				return true;
			} else {
				// País inválido
				return false;
			}
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

}

package com.henriqueandrewsilva.ejb_exercicio_aula3.jsf;

import com.henriqueandrewsilva.ejb_exercicio_aula3.ejb.SomarBean;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

// @author Henrinque Andrew da Silva

@Named(value = "somarJSF")
@RequestScoped
public class SomarJSF {

    @EJB
    private SomarBean somarBean;

    public SomarJSF() {
    }
    
    private String resultado;

    public SomarBean getSomarBean() {
        return somarBean;
    }

    public void setSomarBean(SomarBean somarBean) {
        this.somarBean = somarBean;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    public void chamar_ejb(){
        this.resultado = somarBean.calcular();
    }
}

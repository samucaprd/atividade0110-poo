package br.com.starlog.model;

import java.util.Map;
import java.util.HashMap;

public class BaseLancamento {
    private Map<String, ModuloCarga> modulos = new HashMap<>();

    public void cadastrarModulo(ModuloCarga modulo){
        this.modulos.put(modulo.getIdModulo(), modulo);
    }

    public ModuloCarga buscarModulo(String idModulo){
        return this.modulos.get(idModulo);
    }
}   

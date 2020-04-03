package com.tr.keromotti.newFeatures;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornTest
{

    public static void main(String[] args) throws Exception
    {
        ScriptEngineManager engineManager = new ScriptEngineManager();
        ScriptEngine engine = engineManager.getEngineByName("nashorn");
        engine.eval("function topla(a,b){ return a + b; }");
        Double sonuc=(Double) engine.eval("topla(3,5);");
        System.out.println(sonuc);

    }

}

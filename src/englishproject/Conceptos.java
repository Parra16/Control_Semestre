/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package englishproject;

import java.io.Serializable;

/**
 *
 * @author mosh_
 */
public class Conceptos  implements  Serializable
{
    private String word;
    private String Traslate;
    private String definition;
    private String example;
    private String exam;
    private String prueba;
    private String control;

    

    public Conceptos(String word,String traslate, String definicion, String ejemplo)
    {
        this.word = word;
        this.Traslate = traslate;
        this.definition = definicion;
        this.example = ejemplo;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTraslate() {
        return Traslate;
    }

    public void setTraslate(String Traslate) {
        this.Traslate = Traslate;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

}

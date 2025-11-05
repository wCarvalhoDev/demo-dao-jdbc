package model.entities;

import java.io.Serializable;
import java.util.Objects;

//isso é pros nossos objetos serem transformados em
//sequências de bytes, na linguagem java
//temos que fazer implements Serializable
//se quisermos que nosso objeto seja gravado em arquivo
//trafegado em redes etc
public class Department implements Serializable {

    private Integer id;
    private String name;

    public Department() {
    }

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //hashCode e equals para que meus objetos possam ser
    //comparados por conteúdo, e não pela referência de ponteiros
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return  "id: " + id
                + ", name: " + name;
    }
}

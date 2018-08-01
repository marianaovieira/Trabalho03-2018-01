package pooa20181.iff.br.trabalho03_2018_1.Model;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Mecanico extends RealmObject implements Serializable{

       @PrimaryKey
    int id;
    String nome;
    String funcao;
    String data_nascimento;
    String rua;
    String bairro;
    String municipio;
    String latitude;
    String longitude;

    public Mecanico(){}

    public Mecanico(int id, String nome, String funcao, String data_nascimento, String rua, String bairro, String municipio, String longitude,String latitude){

        this.id = id;
        this.nome = nome;
        this.funcao = funcao;
        this.data_nascimento = data_nascimento;
        this.rua = rua;
        this.bairro = bairro;
        this.municipio = municipio;
        this.latitude = latitude;
        this.longitude = longitude;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

}

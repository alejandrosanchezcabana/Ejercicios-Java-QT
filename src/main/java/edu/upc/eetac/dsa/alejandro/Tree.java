package edu.upc.eetac.dsa.alejandro;

/**
 * Created by Alex on 23/9/15.
 */
public class Tree {
    private String raza;
    private int altura;


    public Tree(){
        this(0,null);
    }
    public Tree(int altura){
        this(altura,null);
    }
    public Tree(String raza){
        this(0,raza);
    }
    public Tree (int altura, String raza){
        this.altura=altura;
        this.raza=raza;
    }

    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Un ");
        if (raza==null)
            sb.append("arbol");
        else
            sb.append(raza);
        if (altura==0)
            sb.append(".");
        else
            sb.append(" de ").append(altura).append(".");
        return sb.toString();
        }
    }

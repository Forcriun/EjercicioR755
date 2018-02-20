import java.util.ArrayList;

class EjercicioR755
{
    public String devolverEnOrden(ArrayList<Integer> numeros)
    {
        String cadenaADevolver = "";        

        if (numeros.size() > 0){
            for(int i = 0; i < numeros.size() - 1; i++){
                Integer numMayor = i;                
                for(int j = i + 1; j < numeros.size(); j++){

                    if(numeros.get(j) > numeros.get(numMayor)){
                        numMayor = j;
                    }

                }

                if(numMayor != i){
                    int temp = numeros.get(i);   // variable de almacenamiento temporal del algoritmo de seleccion para hacer swap con coincidencias posteriores.
                    numeros.set(i,numeros.get(numMayor));
                    numeros.set(numMayor,temp);
                }

            }

            for(Integer numero : numeros){                
                cadenaADevolver += numero + ", ";
            }
        }

        if(cadenaADevolver.length() > 0){
            cadenaADevolver = cadenaADevolver.substring(0,cadenaADevolver.length()-2);
        }
        return cadenaADevolver;
    }
}
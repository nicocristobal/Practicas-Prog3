package Ejercicio2;

public class Password {
	
	private final static int LONG_DEFECTO=8;
	private int longitud;
	private String contrase�a;
	
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int lognitud) {
		this.longitud = lognitud;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	public String generaPassword (){
        String password="";
        for (int i=0;i<longitud;i++){
            //Generamos un numero aleatorio, segun este elige si a�adir una minuscula, mayuscula o numero
            int eleccion=((int)Math.floor(Math.random()*3+1));
  
            if (eleccion==1){
                char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
                password+=minusculas;
            }else{
                if(eleccion==2){
                    char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
                    password+=mayusculas;
                }else{
                    char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
                    password+=numeros;
                }
            }
        }
        return password;
    }
	
	public boolean esFuerte(){
        int cuentanumeros=0;
        int cuentaminusculas=0;
        int cuentamayusculas=0;
        //Vamos caracter a caracter y comprobamos que tipo de caracter es
        for (int i=0;i<contrase�a.length();i++){
                if (contrase�a.charAt(i)>=97 && contrase�a.charAt(i)<=122){
                    cuentaminusculas+=1;
                }else{
                    if (contrase�a.charAt(i)>=65 && contrase�a.charAt(i)<=90){
                        cuentamayusculas+=1;
                }else{
                    cuentanumeros+=1;
                    }
                }
            }
            //Si la constrase�a tiene mas de 5 numeros, mas de 1 minuscula y mas de 2 mayusculas
            if (cuentanumeros>=5 && cuentaminusculas>=1 && cuentamayusculas>=2){
            return true;
        }else{
            return false;
        }
    }
	
	   public Password (){
	        this(LONG_DEFECTO);
	    }
	  
	    public Password (int longitud){
	        this.longitud=longitud;
	        contrase�a=generaPassword();
	    }
	
}

public abstract class Ave {
    private String nombre;
    public  Ave(){

    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public abstract String andar();

    public void mostrar(){
        System.out.println("Soy un "+this.nombre+" y "+andar());
    }


}

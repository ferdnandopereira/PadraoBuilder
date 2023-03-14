public class SmartphoneBuilder {

    private Smartphone smartphone;
    public SmartphoneBuilder(){
        smartphone = new Smartphone();
    }
    public Smartphone build(){
        if(smartphone.getNomeEmpresa() == "")
        {
            throw new IllegalArgumentException("Empresa Inexistente ! ");
        }
        if(smartphone.getModelo().equals("")){
            throw new IllegalArgumentException("Modelo Inválido...");
        }
        return smartphone;
    }
    public SmartphoneBuilder setNomeEmpresa(String nomeEmpresa){
        smartphone.setNomeEmpresa(nomeEmpresa);
        return this;
    }
    public SmartphoneBuilder setModelo(String modelo){
        smartphone.setModelo(modelo);
        return this;
    }
    public SmartphoneBuilder setSoftware(String software){
        smartphone.setSoftware(software);
        return this;
    }
    public SmartphoneBuilder setArmazenamento(int armazenamento){
        smartphone.setArmazenamento(armazenamento);
        return this;
    }
    public SmartphoneBuilder setCapacidadeBateria(int capacidadeBateria){
        smartphone.setCapacidadeBateria(capacidadeBateria);
        return this;
    }
    public SmartphoneBuilder setResistenciaAgua(boolean resistenciaAgua){
        smartphone.setResistenciaAgua(resistenciaAgua);
        return this;
    }
}

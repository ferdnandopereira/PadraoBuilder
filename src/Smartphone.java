public class Smartphone {

    public String nomeEmpresa;
    public String software;
    public String modelo;
    public String processador;
    public int memoriaRAM;
    public int armazenamento;
    public String video;
    public int  dimensaoTela;
    public String conectividade;
    public double cameraFront;
    public double cameraBack;
    public int capacidadeBateria;
    public double dimensoes;
    public boolean resistenciaAgua;
    public double preco;
    public Smartphone(){
        this.nomeEmpresa = "";
        this.modelo = "";
    }

    public String getNomeEmpresa()
    {
        return nomeEmpresa;
    }
    public void setNomeEmpresa(String nomeEmpresa)
    {
        this.nomeEmpresa = nomeEmpresa;
    }
    public String getSoftware()
    {
        return software;
    }
    public void setSoftware(String software)
    {
        this.software =  software;
    }
    public String getModelo()
    {
        return modelo;
    }
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    public String getProcessador()
    {
        return processador;
    }
    public void setProcessador(String processador)
    {
        this.processador = processador;
    }
    public int getMemoriaRAM()
    {
        return memoriaRAM;
    }
    public void setMemoriaRAM(int memoriaRAM)
    {
        this.memoriaRAM = memoriaRAM;
    }
    public int getArmazenamento()
    {
        return armazenamento;
    }
    public void setArmazenamento(int armazenamento)
    {
        this.armazenamento = armazenamento;
    }
    public String getVideo()
    {
        return video;
    }
    public void setVideo(String video)
    {
        this.video = video;
    }
    public int getDimensaoTela()
    {
        return dimensaoTela;
    }
    public void setDimensaoTela(int dimensaoTela)
    {
        this.dimensaoTela = dimensaoTela;
    }
    public String getConectividade()
    {
        return conectividade;
    }
    public void setConectividade(String conectividade)
    {
        this.conectividade = conectividade;
    }
    public double getCameraFront(){

        return cameraFront;
    }
    public void setCameraFront(double cameraFront)
    {
        this.cameraFront = cameraFront;
    }
    public double getCameraBack()
    {
        return cameraBack;
    }
    public void setCameraBack(double cameraBack)
    {
        this.cameraBack = cameraBack;
    }
    public int getCapacidadeBateria()
    {
        return capacidadeBateria;
    }
    public void setCapacidadeBateria(int capacidadeBateria)
    {
        this.capacidadeBateria = capacidadeBateria;
    }
    public double getDimensoes(){

        return dimensoes;
    }
    public void setDimensoes(double dimensoes)
    {
        this.dimensoes = dimensoes;
    }
    public boolean getResistenciaAgua()
    {
        return resistenciaAgua;
    }
    public void setResistenciaAgua(boolean resistenciaAgua)
    {
        this.resistenciaAgua = resistenciaAgua;
    }
    public double getPreco()
    {
        return preco;
    }
    public void setPreco(double preco)
    {
        this.preco = preco;
    }
}

public class NiceCar {
    private  Engine engine;
    private  Media player;

    public NiceCar(){
        engine = new OPEngine();
        player = new CDPlayer();
    }

    public  NiceCar(Engine  engine , Media player){
        this.engine = engine;
        this.player = player;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(){
            this.engine = new  ElectricEngine();
    }
}


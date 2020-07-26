package com.gbq.demo;

public class HostProxy  implements Rent{

    public void setHost(Host host) {
        this.host = host;
    }

    private Host host;

    @Override
    public void rent() {
        seeHouse();
        host.rent();
    }

    public void seeHouse(){
        System.out.println("中介带看房子");
    }
}

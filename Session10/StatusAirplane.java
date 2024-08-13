package Session10;


public enum StatusAirplane {
    darHaleMosaferbari(0),
    ontime(1),
    withDelay(2);

    public Integer StatusAirplane;

    StatusAirplane(Integer integer){
        this.StatusAirplane=integer;
    }


}
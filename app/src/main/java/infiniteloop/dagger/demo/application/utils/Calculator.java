package infiniteloop.dagger.demo.application.utils;


import javax.inject.Inject;

public class Calculator {

    @Inject
    public Calculator() {
    }

    public String multiple(int a, int b){
        return Integer.toString(a*b);
    }

}

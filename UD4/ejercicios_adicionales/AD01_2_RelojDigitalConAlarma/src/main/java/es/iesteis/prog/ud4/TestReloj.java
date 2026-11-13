package es.iesteis.prog.ud4;


public class TestReloj
{
    private RelojAlarma miReloj;
    private RelojAlarma tuReloj;

    public TestReloj()
    {
        miReloj = new RelojAlarma(18, 32);
        tuReloj = new RelojAlarma(23, 58);
    }

    public void test1()
    {
        System.out.println("--- test1 ---");
        miReloj.setAlarma(18, 35);
        System.out.println("Hora actual: " + miReloj.getHora());
        System.out.println("Hora de alarma: " + miReloj.getAlarma());
        for (int i = 0; i < 3; i++) {
            miReloj.emitirTic();
        }
        System.out.println("Hora tras avanzar 3 minutos: " + miReloj.getHora());
    }

    public void test2()
    {
        System.out.println("--- test2 ---");
        tuReloj.setAlarma(7, 0);
        System.out.println("Hora actual: " + tuReloj.getHora());
        System.out.println("Hora de alarma: " + tuReloj.getAlarma());
        for (int i = 0; i < 5; i++) {
            tuReloj.emitirTic();
        }
        System.out.println("Hora tras avanzar 5 minutos: " + tuReloj.getHora());
    }

    public void test3()
    {
        System.out.println("--- test3 ---");
        tuReloj.ponerEnHora(6, 58);
        System.out.println("Hora actual tras ponerEnHora(6, 58): " + tuReloj.getHora());
        System.out.println("Hora de alarma: " + tuReloj.getAlarma());
        for (int i = 0; i < 3; i++) {
            tuReloj.emitirTic();
        }
        System.out.println("Hora tras avanzar 3 minutos: " + tuReloj.getHora());
    }
}
public class Telephone {
    private boolean display;
    private String firm;
    private int coresCount;

    public Telephone(boolean display, String firm, int coresCount) {
        this.display = display;
        this.firm = firm;
        this.coresCount = coresCount;
    }

    public void call(String number){
        System.out.println("Звоним по номеру " + number);
    }

    public String offOrOnTelephone(){
        return display ? "Телефон включен" : "Телефон выключен";
    }

    @Override
    public String toString() {
        return "Фирма телефона: " + firm + ", включен ли экран: " + display + ", количество ядер у телефона: " + coresCount;
    }
}


public class Orders {
    public interface OrdersSys {
        public void set();
        public void get();
    }
    public static void main(String[] args) {
        OrdersSys Order = new OrdersSys() {
            int idOrder, idOrderType, idOrderVariety, idCurrency;
            String Tiker, Count, Type, Number, Data, Duration;

            @Override
            public void set(){
                this.idOrder = 1;
                this.idOrderType = 1;
                this.idOrderVariety = 1;
                this.idCurrency = 1;
                this.Tiker = "Тикер";
                this.Count = "10";
                this.Type = "Покупка";
                this.Number = "473234";
                this.Data = "11.04.2023";
                this.Duration = "90 дней";
            }
            @Override
            public void get() {
                System.out.println("ID Поручения: "+ idOrder
                        + "\nID Типа сделки: " + idOrderType
                        + "\nID Вида сделки: " + idOrderVariety
                        + "\nID Валюты: " + idCurrency
                        + "\nТикер: " + Tiker
                        + "\nКол-во: " + Count
                        + "\nТип поручения: " + Type
                        + "\nНомер поручения: " + Number
                        + "\nДата получения: " + Data
                        + "\nСрок действия: " + Duration);
            }
        };
        OrdersSys OrderType = new OrdersSys() {
            int idOrderType;
            String Type;
            @Override
            public void set() {
                this.idOrderType = 1;
                this.Type = "Брокерская";
            }
            @Override
            public void get() {
                System.out.println("ID Типа Сделки: " + idOrderType
                        + "\nТип сделки: " + Type);
            }
        };
        OrdersSys OrderVariety = new OrdersSys() {
            int idVariety;
            String Variety;
            @Override
            public void set() {
                this.idVariety = 1;
                this.Variety = "Покупка";
            }
            @Override
            public void get() {
                System.out.println("ID Вида Поручения: " + idVariety
                        + "\nВид поручения : " + Variety);
            }
        };
        OrdersSys Currency = new OrdersSys() {
            int idCurrency;
            String CurrencyFull, CurrencyShort;
            @Override
            public void set() {
                this.idCurrency = 1;
                this.CurrencyFull = "Рубль";
                this.CurrencyShort = "Руб";
            }
            @Override
            public void get() {
                System.out.println("ID Валюты: " + idCurrency
                        + "\nПолное название валюты : " + CurrencyFull
                        + "\nАббревиатура: " + CurrencyShort);
            }
        };
        System.out.println("......Поручения......");
        Order.set();
        Order.get();
        System.out.println("\n......Тип Сделки......");
        OrderType.set();
        OrderType.get();
        System.out.println("\n......Вид Сделки......");
        OrderVariety.set();
        OrderVariety.get();
        System.out.println("\n......Валюта......");
        Currency.set();
        Currency.get();
    }
}
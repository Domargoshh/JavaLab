public class Orders {
    public interface Lambda {
        public void run();
    }
    public static void main(String[] args) {
        Lambda Order = () -> {
            int idOrder, idOrderType, idOrderVariety, idCurrency;
            String Tiker, Count, Type, Number, Data, Duration;

            idOrder = 1;
            idOrderType = 1;
            idOrderVariety = 1;
            idCurrency = 1;
            Tiker = "Тикер";
            Count = "10";
            Type = "Покупка";
            Number = "473234";
            Data = "11.04.2023";
            Duration = "90 дней";
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
        };
        Lambda OrderType = () -> {
            int idOrderType;
            String Type;

            idOrderType = 1;
            Type = "Брокерская";

            System.out.println("ID Типа Сделки: " + idOrderType
                    + "\nТип сделки: " + Type);
        };
        Lambda OrderVariety = () -> {
            int idVariety;
            String Variety;

            idVariety = 1;
            Variety = "Покупка";

            System.out.println("ID Вида Поручения: " + idVariety
                    + "\nВид поручения : " + Variety);

        };
        Lambda Currency = () -> {
            int idCurrency;
            String CurrencyFull, CurrencyShort;

            idCurrency = 1;
            CurrencyFull = "Рубль";
            CurrencyShort = "Руб";
            System.out.println("ID Валюты: " + idCurrency
                    + "\nПолное название валюты : " + CurrencyFull
                    + "\nАббревиатура: " + CurrencyShort);

        };
        System.out.println("......Поручения......");
        Order.run();
        System.out.println("\n......Тип Сделки......");
        OrderType.run();
        System.out.println("\n......Вид Сделки......");
        OrderVariety.run();
        System.out.println("\n......Валюта......");
        Currency.run();
    }
}
public class ManagerAfisha {
    private AfishaItems[] items = new AfishaItems[0];
    private int countOfItems;

    public ManagerAfisha() {
        this.countOfItems = 10;
    }

    public ManagerAfisha(int amount) {
        this.countOfItems = amount;
    }

    public void add(AfishaItems item) {
        AfishaItems[] tmp = new AfishaItems[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public AfishaItems[] getItems() {
        return items;
    }

    public AfishaItems[] findAll() {
        AfishaItems[] reversed = new AfishaItems[items.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = items[items.length - 1 - i];
        }
        return reversed;
    }

    public AfishaItems[] findLast() {
        int lengthNewArray;
        lengthNewArray = Math.min(items.length, this.countOfItems);
        /* Можно вместо Math для вычисления длины нового массива воспользоваться
           стандартным if-else, как рекомендовано в условиях дз

          if (items.length <= this.countOfItems) {
            lengthNewArray = items.length;
            }
          else {lengthNewArray = this.countOfItems;}
        */

        AfishaItems[] countOfLast = new AfishaItems[lengthNewArray];
        for (int i = 0; i < countOfLast.length; i++) {
            countOfLast[i] = items[items.length - 1 - i];
        }
        return countOfLast;
    }
}

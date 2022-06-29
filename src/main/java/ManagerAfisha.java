public class ManagerAfisha {
    private AfishaRepository repository;

    public ManagerAfisha(AfishaRepository repository) {
        this.repository = repository;
    }

    public void add(AfishaItems item) {
        repository.save(item);
    }

    public AfishaItems[] managerGetItems() {
        return repository.getItems();
    }

    public AfishaItems[] managerFindAll() {
        return repository.findAll();
    }

    public AfishaItems[] findLast(int countOfItems) {
        AfishaItems[] tmp = repository.getItems();
        int lengthNewArray;
        lengthNewArray = Math.min(tmp.length, countOfItems);
        AfishaItems[] countOfLast = new AfishaItems[lengthNewArray];
        for (int i = 0; i < countOfLast.length; i++) {
            countOfLast[i] = tmp[tmp.length - 1 - i];
        }
        return countOfLast;
    }
}
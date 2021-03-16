package HashTables;
/**
 * Class for Item
 * @param <K>
 * @param <E>
 */
public class Item<K, E> {
	private K key;
	private E elem;
	
	//Purpose: Defines an Item
	public Item(K k, E e) {
		key = k;
		elem = e;
	}
	//Purpose: To obtain the key of an item
	public K getKey() {return key;}
	
	//Purpose: To obtain the element of an item
	public E getElem() {return elem;}
}

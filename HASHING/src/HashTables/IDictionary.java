package HashTables;
import java.util.Iterator;

public interface IDictionary<K, E> {
	//Purpose: To determine the number of elements in this dictionary
	public Integer size();
	//Purpose: To determine if this dictionary is empty
	public Boolean isEmpty();
	//Purpose: To return an iterator for this dictionary's element
	public Iterator<E> elements();
	//Purpose: To return an iterator for this dictionary's keys
	public Iterator<K> keys();
	//Purpose: To return elements associated with the given key
	public E findElement(K k);
	//Purpose: To insert a pair for the given key and element
	//Effect: A new pair is added to this dictionary & size is increased by one
	public void insert(K k, E e);
	//Purpose: To delete the given key and element from this dictionary
	public void delete(K k);

}

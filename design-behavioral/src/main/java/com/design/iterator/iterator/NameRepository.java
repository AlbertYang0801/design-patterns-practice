package com.design.iterator.iterator;

/**
 * @author yangjunwei
 * @date 2024/8/30
 */
public class NameRepository implements Container<String> {

    public String[] names = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator<String> iterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {

        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }


}

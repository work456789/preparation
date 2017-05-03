package com.src;

public class ListNodeCustom {
   private Object data;
   private ListNodeCustom next;

   public ListNodeCustom() {

   }

   public ListNodeCustom(Object data, ListNodeCustom next) {
       this.data = data;
       this.next = next;
   }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ListNodeCustom getNext() {
        return next;
    }

    public void setNext(ListNodeCustom next) {
        this.next = next;
    }
}

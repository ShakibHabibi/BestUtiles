package com.shkbhbb.bestutils;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shkbhbb on 11/3/18.
 */

public class Sort {

  public Sort() {
  }

  public <E extends Comparable<E>> List<E> mergeSort(List<E> objects) {
    if (objects.size() <= 1) {
      return objects;
    }
    List<E> left = new ArrayList<>();
    List<E> right = new ArrayList<>();

    int center = objects.size() / 2;

    for (int i = 0; i < center; i++) {
      left.add(objects.get(i));
    }

    for (int i = center; i < objects.size(); i++) {
      right.add(objects.get(i));
    }

    mergeSort(left);
    mergeSort(right);
    Log.i("aaaaLEFT", left.toString());
    Log.i("aaaaRIGHT", right.toString());
    merge(left, right, objects);
    Log.i("aaaaRES", objects.toString());
    return objects;
  }

  protected <E extends Comparable<E>> void merge(List<E> left, List<E> right, List<E> objects) {
    int leftListSize = left.size();
    int rightListSize = right.size();
    int pointerA = 0;
    int pointerB = 0;
    int pointer = 0;
    while (pointerA < leftListSize && pointerB < rightListSize) {
      if (left.get(pointerA).compareTo(right.get(pointerB)) <= 0) {
        objects.set(pointer, left.get(pointerA));
        pointerA++;
      } else {
        objects.set(pointer, right.get(pointerB));
        pointerB++;
      }
      pointer++;
      while (pointerA == leftListSize && pointerB < rightListSize) {
        objects.set(pointer, right.get(pointerB));
        pointerB++;
        pointer++;
      }
      while (pointerB == rightListSize && pointerA < leftListSize) {
        objects.set(pointer, left.get(pointerA));
        pointerA++;
        pointer++;
      }
    }
  }
}

package models;

public class Interval_MergingIntervals implements Comparable<Interval_MergingIntervals> {
	Integer start, end;

	public Interval_MergingIntervals(Integer start, Integer end) {
		this.start = start;
		this.end = end;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getEnd() {
		return end;
	}

	public void setEnd(Integer end) {
		this.end = end;
	}

	public int compareTo(Interval_MergingIntervals intervals) {
		return this.start - intervals.start;
	}
}

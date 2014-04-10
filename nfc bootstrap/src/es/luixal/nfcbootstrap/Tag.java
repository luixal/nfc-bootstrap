package es.luixal.nfcbootstrap;

import android.os.Parcel;
import android.os.Parcelable;

public class Tag implements Parcelable {
	
	private String uuid;
	
	
	public Tag() {
		super();
		this.uuid = "";
	}

	public Tag(String uuid) {
		super();
		this.uuid = uuid;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		return "Tag [uuid=" + uuid + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Tag == false) return false;
		return ((Tag)obj).getUuid().equalsIgnoreCase(this.getUuid());
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.uuid);
	}
	
}

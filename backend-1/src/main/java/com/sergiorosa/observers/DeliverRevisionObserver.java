package com.sergiorosa.observers;

import com.sergiorosa.entities.Deliver;

public interface DeliverRevisionObserver {
	void onSaveRevision(Deliver deliver);
}

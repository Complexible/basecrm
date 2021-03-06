/*
 * Copyright (c) 2015 Complexible Inc. <http://complexible.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.complexible.basecrm;

import com.google.common.base.Function;
import com.google.common.base.Objects;

/**
 * <p></p>
 *
 * @author  Michael Grove
 * @since   0.1
 * @version 0.2
 */
public final class TagEntry {
	public static final Function<TagEntry, Tag> UNWRAP = new Function<TagEntry, Tag>() {
		@Override
		public Tag apply(final TagEntry input) {
			return input.getTag();
		}
	};

	private Tag mTag;

	public TagEntry() {
	}

	public TagEntry(final Tag theTag) {
		mTag = theTag;
	}

	public Tag getTag() {
		return mTag;
	}

	public void setTag(final Tag theTag) {
		mTag = theTag;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		return Objects.hashCode(mTag);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(final Object theObj) {
		if (theObj == this) {
			return true;
		}
		else if (theObj instanceof TagEntry) {
			return Objects.equal(mTag, ((TagEntry) theObj).mTag);
		}
		else {
			return false;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return mTag.toString();
	}
}

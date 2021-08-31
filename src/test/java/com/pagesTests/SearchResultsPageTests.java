package com.pagesTests;

import org.testng.annotations.Test;

import com.pages.SearchResultsPage;
import com.utilities.BaseClass;

public class SearchResultsPageTests extends BaseClass {
	@Test
	public void verifySearchedDataDisplaysRelatedResults() {
		SearchResultsPage search = new SearchResultsPage();
		search.verifySearchedDataDisplaysRelatedResults("Blouse");
}

}

@Test
	public void Activity6() throws InterruptedException {
		driver.get("https://alchemy.hguy.co/jobs");
		Job = driver.findElement(By.xpath("//*[@class=\"main-navigation\"]//li[1]/a"));
		Job.click();
		Keyword = driver.findElement(By.id("search_keywords"));
		Keyword.sendKeys("Banking");
		Search_jobs = driver.findElement(By.xpath("//*[@class='search_submit']/input"));
		Search_jobs.click();
		Thread.sleep(2000);
		Job_listing = driver.findElements(By.xpath("//ul[@class='job_listings']/li"));
		Job_listing.get(0).click();
		Apply_jobs = driver.findElement(By.xpath("//*[@class='single_job_listing']//input"));
		Apply_jobs.click();
		Thread.sleep(2000);
		Job_application_email = driver.findElement(By.className("job_application_email"));
		String email = Job_application_email.getText();
		assertEquals(email, "abhiram@cklabs.com");
		driver.close();
	}

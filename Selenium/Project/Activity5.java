@Test
	public void Activity5() {
		driver.get("https://alchemy.hguy.co/jobs");
		Job = driver.findElement(By.xpath("//*[@class=\"main-navigation\"]//li[1]/a"));
		Job.click();
		String Job_Title = driver.getTitle();
		/*
		 * if (Job_Title.equals("Jobs – Alchemy Jobs")) { driver.close(); }
		 */
		assertEquals(Job_Title, "Jobs – Alchemy Jobs");
		driver.close();
	}

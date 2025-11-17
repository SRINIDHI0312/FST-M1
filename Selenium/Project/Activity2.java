@Test
	public void Activity2() {
		driver.get("https://alchemy.hguy.co/jobs");
		// Heading1 = driver.findElement(By.tagName("h1"));
		Heading1 = driver.findElement(By.className("entry-title"));
		String Header1 = Heading1.getText();
		/*
		 * if(Header1.equals("Welcome to Alchemy Jobs")) { driver.close(); }
		 */
		assertEquals(Header1, "Welcome to Alchemy Jobs");
		driver.close();
	}

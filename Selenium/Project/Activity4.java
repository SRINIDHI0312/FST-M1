@Test
	public void Activity4() {
		driver.get("https://alchemy.hguy.co/jobs");
		Heading2 = driver.findElement(By.tagName("h2"));
		String Header2 = Heading2.getText();
		/*
		 * if(Header2.equals("Quia quis non")) { driver.close(); }
		 */
		assertEquals(Header2, "Quia quis non");
		driver.close();
	}

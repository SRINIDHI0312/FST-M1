@Test
	public void Activity3() {
		driver.get("https://alchemy.hguy.co/jobs");
		Image = driver.findElement(By.tagName("img"));
		System.out.println(Image.getAttribute("src"));
		driver.close();
	}

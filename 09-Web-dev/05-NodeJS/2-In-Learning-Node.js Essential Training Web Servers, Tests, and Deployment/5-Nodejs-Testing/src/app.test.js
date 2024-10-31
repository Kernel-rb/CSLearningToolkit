import request from 'supertest';
import app from './app';

describe("API Test", () => {
    if ("Get - Dict", async () => {
        const { body } = await request(app).get("/dict");
        expect(body).toEqual({ "message": "Welcome to the dictionary API" });
    });
    it("Post - Dict", async () => {
        const { body } = await request(app).post("/dict").send({ "word": "test", "meaning": "test" });
        expect(body).toEqual({ "message": "Word added to the dictionary" });
    });
    if("Delete - Dict", async () => {
        const { body } = await request(app).delete("/dict/test");
        expect(body).toEqual({ "message": "Word deleted from the dictionary" });
    });

});


